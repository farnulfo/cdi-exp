package org.arnulfo.cdi.exp;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Logged
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
public class LoggedInterceptor implements Serializable {

  public LoggedInterceptor() {
  }

  @AroundInvoke
  public Object logMethodEntry(InvocationContext invocationContext)
    throws Exception {
    System.out.println("Entering method: "
      + invocationContext.getMethod().getName() + " in class "
      + invocationContext.getMethod().getDeclaringClass().getName());
    Object[] parameters = invocationContext.getParameters();
    System.out.println("Parameters: " + Arrays.toString(parameters));
    if (parameters.length == 1) {
      if (parameters[0].equals("Franck")) {
        invocationContext.setParameters(new String[] { "Alfred" });
      }
    }

    return invocationContext.proceed();
  }
}

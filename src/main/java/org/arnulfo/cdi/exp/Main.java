package org.arnulfo.cdi.exp;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author Franck Arnulfo
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Weld weld = new Weld();
    WeldContainer container = weld.initialize();
    container.select(MyApplicationBean.class).get().callBusinessMethod();
    container.select(MyApplicationBean.class).get().callBusinessMethodWithParamters("Franck");
    container.shutdown();
  }

}

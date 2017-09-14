package org.arnulfo.cdi.exp;

/**
 *
 * @author Franck Arnulfo
 */
class MyApplicationBean {

  @Logged
  void callBusinessMethod() {
    System.out.println("Hello World !");
  }

  @Logged
  void callBusinessMethodWithParamters(String name) {
    System.out.println("Hello " + name);
  }

}

class TestComplexNum {
    public static void main(String[] args) {
      /*
       * Testare la classe come segue:
       *
       * 1) Creare il numero complesso 3+5i e memorizzarlo nella variabile c1
       *
       * 2) Creare il numero complesso 7-4i e memorizzarlo nella variabile c2
       *
       * 3) Creare il numero complesso -2+3i e memorizzarlo nella variabile c3
       *
       * 4) Creare il numero complesso -2+3i e memorizzarlo nella variabile c4
       *
       * 5) Stampare in standard output la rappresentazione testuale di
       * c1,c2,c3,c4 restituita dal metodo toStringRep()
       *
       * 6) Sommare a c1 c2
       * (somma di due num complessi (a + ib) + (c + id) = (a + c) + i(b + d)
       *
       * 7) Sommare a c2 c4
       *
       * 8) Stampare nuovamente in standard output la rappresentazione testuale
       * di c1,c2,c3,c4
       *
       * 9) Controllare se l'output corrisponde a quanto preventivato
       *
       * 10) Invocare il metodo equal su c3 per tre volte, passando come input
       * c1,c2,c4. Stampare il risultato di ciascuna invocazione in standard
       * output
       *
       * 11) Controllare se l'output corrisponde a quanto preventivato
       */

      //1) Creo il numero complesso 3+5i e lo memorizzo in c1
      ComplexNum c1 = new ComplexNum();
      c1.build(3, 5);

      //2) Creo il numero complesso 7-4i e lo memorizzo in c2
      ComplexNum c2 = new ComplexNum();
      c2.build(7, -4);

      //3) Creo il numero complesso -2+3i e lo memorizzo in c2
      ComplexNum c3 = new ComplexNum();
      c3.build(-2, 3);
      
      //4) Creo il numero complesso -2+3i e lo memorizzo in c4
      ComplexNum c4 = new ComplexNum();
      c4.build(-2, 3);

      //5) Stampo la rappresentazione testuale di c1, c2, c3 e c4
      System.out.println(c1.toStringRep());
      System.out.println(c2.toStringRep());
      System.out.println(c3.toStringRep());
      System.out.println(c4.toStringRep());
      System.out.println("");

      //6) Sommo a c1 c2
      c1.add(c2);

      //7) Sommo a c2 c4
      c2.add(c4);

      //8) Stampo di nuovo tutti i numeri
      System.out.println(c1.toStringRep());
      System.out.println(c2.toStringRep());
      System.out.println(c3.toStringRep());
      System.out.println(c4.toStringRep());
      System.out.println("");

      //10) Invoco il metodo equals su c3 passando a parametro tutti gli altri numeri e stampo a schermo il risultato
      System.out.println("c3 is equal to c1?   " + c3.equal(c1));
      System.out.println("c3 is equal to c2?   " + c3.equal(c2));
      System.out.println("c3 is equal to c4?   " + c3.equal(c4));
    }
}

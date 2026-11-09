package minecraft;

class class07015 {
   static final class07037[] N = new class07037[256];

   private class07015() {
      super();
   }

   static {
      for (int i = 0; i < N.length; i++) {
         N[i] = new class07037((byte)(i - 128));
      }
   }
}

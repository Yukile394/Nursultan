package minecraft;

public interface class06267 {
   default int L() {
      int i = 0;

      for (int j = 0; j < 16; j++) {
         i |= this.N(j);
      }

      return i;
   }

   default int u() {
      int i = this.L();
      int j = this.N();
      int k;
      int l;
      if (i == 0) {
         k = 0;
         l = j;
      } else {
         k = Integer.numberOfLeadingZeros(i);
         l = 32 - Integer.numberOfTrailingZeros(i) - 1;
      }

      return class06250.N(k, l);
   }

   int N();

   int N(int var1);
}

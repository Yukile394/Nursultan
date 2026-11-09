package minecraft;

public interface class02950 {
   default boolean y() {
      for (int i = 0; i < this.N(); i++) {
         if (!this.N(i).R()) {
            return false;
         }
      }

      return true;
   }

   int N();

   class06584 N(int var1);
}

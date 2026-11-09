package minecraft;

import org.jspecify.annotations.Nullable;

public interface class01765 {
   boolean L();

   default void M() {
      this.N(0);
   }

   void i();

   void u();

   default int y(int var1) {
      int i = this.N() + var1;
      this.N(i);
      return i;
   }

   @Nullable
   class00392 y();

   void N(@Nullable class01762 var1);

   void N(@Nullable class00392 var1);

   int N();

   void N(int var1);

   default int R() {
      return this.y(1);
   }
}

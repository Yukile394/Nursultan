package minecraft;

public interface class07583 {
   default boolean L(int var1, int var2, int var3) {
      return var1 >= var3 / 2 && var1 < var3 && var2 >= 0 && var2 < var3;
   }

   default boolean M(int var1, int var2, int var3) {
      return var1 >= 0 && var1 < var3 / 2 && var2 >= var3 / 2 && var2 < var3;
   }

   default boolean i(int var1, int var2, int var3) {
      return var1 >= var3 / 2 && var1 < var3 && var2 >= var3 / 2 && var2 < var3;
   }

   default boolean u(int var1, int var2, int var3) {
      return var1 >= var3 / 2 && var1 < var3 && var2 >= 0 && var2 < var3 / 2;
   }

   default boolean y(int var1, int var2, int var3) {
      return var1 >= 0 && var1 < var3 / 2 && var2 >= 0 && var2 < var3;
   }

   default boolean N(int var1, int var2, int var3) {
      return var1 >= 0 && var1 < var3 && var2 >= 0 && var2 < var3;
   }

   default boolean R(int var1, int var2, int var3) {
      return var1 >= 0 && var1 < var3 / 2 && var2 >= 0 && var2 < var3 / 2;
   }
}

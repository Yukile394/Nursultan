package minecraft;

public record class08623(class07209 localPos, class00753 size) {
   public class08623(class07209 localPos, class00753 size) {
      this.localPos = localPos;
      this.size = size;
   }

   public class00753 y() {
      return this.size;
   }

   public class07209 N() {
      return this.localPos;
   }

   public static class08623 N(int var0, int var1, int var2, int var3, int var4, int var5) {
      int i = Math.min(var0, var3);
      int j = Math.min(var1, var4);
      int k = Math.min(var2, var5);
      return new class08623(new class07209(i, j, k), new class00753(Math.max(var0, var3) - i, Math.max(var1, var4) - j, Math.max(var2, var5) - k));
   }
}

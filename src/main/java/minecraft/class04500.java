package minecraft;

public enum class04500 {
   field_50186(class07107.J),
   field_50187(class07107.X);

   public final class07134 field_50188;

   private class04500(class07134 var3) {
      this.field_50188 = var3;
   }

   public int N() {
      return this.ordinal();
   }

   public static class04500 N(int var0) {
      class04500[] aclass04500 = values();
      return var0 <= aclass04500.length && var0 >= 0 ? aclass04500[var0] : field_50186;
   }
}

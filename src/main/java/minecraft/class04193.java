package minecraft;

public enum class04193 {
   field_44974,
   field_44975,
   field_48227;

   private static final int field_44976 = 1;
   private static final int field_44977 = 2;
   private static final int field_48228 = 3;

   private class04193() {
   }

   public int N() {
      return switch (this) {
         case field_44974 -> 1;
         case field_44975 -> 2;
         case field_48227 -> 3;
      };
   }

   public static class04193 N(int var0) {
      return switch (var0) {
         case 1 -> field_44974;
         case 2 -> field_44975;
         case 3 -> field_48227;
         default -> throw new IllegalArgumentException("Unknown connection intent: " + var0);
      };
   }
}

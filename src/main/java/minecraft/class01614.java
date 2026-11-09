package minecraft;

public enum class01614 {
   field_14223("old"),
   field_14220("new"),
   field_61159("unknown"),
   field_14224("compatible");

   public static final int field_61160 = Integer.MAX_VALUE;
   private final class00392 field_14219;
   private final class00392 field_14222;

   public class00392 L() {
      return this.field_14222;
   }

   private class01614(String var3) {
      this.field_14219 = class00392.L("pack.incompatible." + var3).N(class06541.field_1080);
      this.field_14222 = class00392.L("pack.incompatible.confirm." + var3);
   }

   public class00392 y() {
      return this.field_14219;
   }

   public static class01614 N(class04548<class08735> var0, class08735 var1) {
      if (((class08735)var0.N()).y() == Integer.MAX_VALUE) {
         return field_61159;
      } else if (((class08735)var0.y()).compareTo(var1) < 0) {
         return field_14223;
      } else {
         return var1.compareTo((class08735)var0.N()) < 0 ? field_14220 : field_14224;
      }
   }

   public boolean N() {
      return this == field_14224;
   }
}

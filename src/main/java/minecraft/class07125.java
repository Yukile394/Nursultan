package minecraft;

public class class07125 {
   private final boolean field_40828;
   private final String field_40829;
   private final class01996 field_40830;

   public class07125(class07094 var1, boolean var2, String var3, class01996 var4) {
      super();
      this.field_40827 = var1;
      this.field_40828 = var2;
      this.field_40829 = var3;
      this.field_40830 = var4;
   }

   public <T extends class07135> T method_46566(class07124<T> var1) {
      class07135 class07135 = var1.create(this.field_40830);
      String s = this.field_40829 + "/" + class07135.method_10321();
      if (!this.field_40827.field_40826.add(s)) {
         throw new IllegalStateException("Duplicate provider: " + s);
      } else {
         if (this.field_40828) {
            this.field_40827.field_38909.put(s, class07135);
         }

         return (T)class07135;
      }
   }
}

package minecraft;

public record class06945(class03767 enabledFeatures, boolean hasPermissions, class01929 holders) {

   public class01929 L() {
      return this.holders;
   }

   public class06945(class03767 enabledFeatures, boolean hasPermissions, class01929 holders) {
      super();
      this.enabledFeatures = enabledFeatures;
      this.hasPermissions = hasPermissions;
      this.holders = holders;
   }

   public boolean y() {
      return this.hasPermissions;
   }

   public class03767 N() {
      return this.enabledFeatures;
   }

   public boolean N(class03767 var1, boolean var2, class01929 var3) {
      return !this.enabledFeatures.equals(var1) || this.hasPermissions != var2 || this.holders != var3;
   }
}

package minecraft;

public record class01883(class01894 enabled, class01894 disabled, class01894 enabledFocused, class01894 disabledFocused) {
   public class01894 L() {
      return this.enabledFocused;
   }

   public class01883(class01894 enabled, class01894 disabled, class01894 enabledFocused, class01894 disabledFocused) {
      this.enabled = enabled;
      this.disabled = disabled;
      this.enabledFocused = enabledFocused;
      this.disabledFocused = disabledFocused;
   }

   public class01883(class01894 var1, class01894 var2, class01894 var3) {
      this(var1, var2, var3, var2);
   }

   public class01883(class01894 var1, class01894 var2) {
      this(var1, var1, var2, var2);
   }

   public class01883(class01894 var1) {
      this(var1, var1, var1, var1);
   }

   public class01894 u() {
      return this.disabledFocused;
   }

   public class01894 y() {
      return this.disabled;
   }

   public class01894 N(boolean var1, boolean var2) {
      if (var1) {
         return var2 ? this.enabledFocused : this.enabled;
      } else {
         return var2 ? this.disabledFocused : this.disabled;
      }
   }

   public class01894 N() {
      return this.enabled;
   }
}

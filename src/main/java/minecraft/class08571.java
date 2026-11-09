package minecraft;

public record class08571(class01894 sheet, String prefix) {
   public class08571(class01894 sheet, String prefix) {
      this.sheet = sheet;
      this.prefix = prefix;
   }

   public String y() {
      return this.prefix;
   }

   public class05913 N(String var1) {
      return this.N(class01894.y(var1));
   }

   public class01894 N() {
      return this.sheet;
   }

   public class05913 N(class01894 var1) {
      return new class05913(this.sheet, var1.R(this.prefix + "/"));
   }
}

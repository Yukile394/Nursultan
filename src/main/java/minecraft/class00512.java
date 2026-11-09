package minecraft;

public record class00512(class01894 cooldownGroup, int duration) implements class00381<class07280> {
   public static final class02362<class04247, class00512> N = class02362.N(class01894.y, class00512::N, class02389.B, class00512::y, class00512::new);

   public class00512(class01894 cooldownGroup, int duration) {
      super();
      this.cooldownGroup = cooldownGroup;
      this.duration = duration;
   }

   public int y() {
      return this.duration;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class01894 N() {
      return this.cooldownGroup;
   }

   @Override
   public class02897<class00512> method_65080() {
      return class04248.G;
   }
}

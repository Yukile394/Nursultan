package minecraft;

public record class02934(class06584 template, class06584 base, class06584 addition) implements class02950 {
   public class06584 L() {
      return this.template;
   }

   public class02934(class06584 template, class06584 base, class06584 addition) {
      super();
      this.template = template;
      this.base = base;
      this.addition = addition;
   }

   public class06584 i() {
      return this.addition;
   }

   public class06584 u() {
      return this.base;
   }

   @Override
   public boolean y() {
      return this.template.R() && this.base.R() && this.addition.R();
   }

   @Override
   public int N() {
      return 3;
   }

   @Override
   public class06584 N(int var1) {
      return switch (var1) {
         case 0 -> this.template;
         case 1 -> this.base;
         case 2 -> this.addition;
         default -> throw new IllegalArgumentException("Recipe does not contain slot " + var1);
      };
   }
}

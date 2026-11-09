package minecraft;

public record class04459(class00392 content, boolean overlay) implements class00381<class07280> {
   public static final class02362<class04247, class04459> N = class02362.N(class03748.u, class04459::N, class02389.y, class04459::y, class04459::new);

   public class04459(class00392 content, boolean overlay) {
      this.content = content;
      this.overlay = overlay;
   }

   @Override
   public boolean i() {
      return true;
   }

   public boolean y() {
      return this.overlay;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class00392 N() {
      return this.content;
   }

   @Override
   public class02897<class04459> method_65080() {
      return class04248.yi;
   }
}

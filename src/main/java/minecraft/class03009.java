package minecraft;

record class03009(class04018 target) implements class04018 {
   class03009(class04018 target) {
      super();
      this.target = target;
   }

   @Override
   public boolean y() {
      return !this.target.y();
   }

   public class04018 N() {
      return this.target;
   }
}

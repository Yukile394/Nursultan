package minecraft;

record class06336(class07209 pos, class04651 fluid, class00500 sourceState) {

   public class00500 L() {
      return this.sourceState;
   }

   class06336(class07209 pos, class04651 fluid, class00500 sourceState) {
      this.pos = pos;
      this.fluid = fluid;
      this.sourceState = sourceState;
   }

   public class04651 y() {
      return this.fluid;
   }

   public class07209 N() {
      return this.pos;
   }
}

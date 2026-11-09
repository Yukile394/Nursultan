package minecraft;

public record class03099(int depth, class03102 returnValueConsumer, class03115 frameControl) {
   public int L() {
      return this.depth;
   }

   public class03099(int depth, class03102 returnValueConsumer, class03115 frameControl) {
      this.depth = depth;
      this.returnValueConsumer = returnValueConsumer;
      this.frameControl = frameControl;
   }

   public class03115 i() {
      return this.frameControl;
   }

   public class03102 u() {
      return this.returnValueConsumer;
   }

   public void y() {
      this.frameControl.discard();
   }

   public void N() {
      this.returnValueConsumer.N();
   }

   public void N(int var1) {
      this.returnValueConsumer.N(var1);
   }
}

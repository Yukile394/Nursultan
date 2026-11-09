package minecraft;

public record class06524(boolean advanced, boolean creative) implements class06497 {
   public class06524 L() {
      return new class06524(this.advanced, true);
   }

   public class06524(boolean advanced, boolean creative) {
      super();
      this.advanced = advanced;
      this.creative = creative;
   }

   public boolean i() {
      return this.creative;
   }

   public boolean u() {
      return this.advanced;
   }

   @Override
   public boolean y() {
      return this.creative;
   }

   @Override
   public boolean N() {
      return this.advanced;
   }
}

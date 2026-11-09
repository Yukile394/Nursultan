package minecraft;

public record class05507(class07701 source, class05494 tracker) implements class05532 {
   private void L() {
      if (this.tracker.Z()) {
         this.source.N(() -> class00392.N("commands.test.summary", this.tracker.B()).N(class06541.field_1068), true);
         if (this.tracker.u()) {
            this.source.y(class00392.N("commands.test.summary.failed", this.tracker.N()));
         } else {
            this.source.N(() -> class00392.L("commands.test.summary.all_required_passed").N(class06541.field_1060), true);
         }

         if (this.tracker.i()) {
            this.source.N(class00392.N("commands.test.summary.optional_failed", this.tracker.y()));
         }
      }
   }

   public class05507(class07701 source, class05494 tracker) {
      this.source = source;
      this.tracker = tracker;
   }

   public class05494 y() {
      return this.tracker;
   }

   @Override
   public void y(class05513 var1, class05520 var2) {
      this.L();
   }

   @Override
   public void N(class05513 var1, class05513 var2, class05520 var3) {
      this.tracker.N(var2);
   }

   public class07701 N() {
      return this.source;
   }

   @Override
   public void N(class05513 var1) {
   }

   @Override
   public void N(class05513 var1, class05520 var2) {
      this.L();
   }
}

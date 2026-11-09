package minecraft;

record class05510(class07701 source) implements class04251 {
   class05510(class07701 source) {
      this.source = source;
   }

   @Override
   public void y(class05531 var1) {
   }

   public class07701 N() {
      return this.source;
   }

   @Override
   public void N(class05531 var1) {
      this.source.N(() -> class00392.N("commands.test.batch.starting", var1.L().M(), var1.N()), true);
   }
}

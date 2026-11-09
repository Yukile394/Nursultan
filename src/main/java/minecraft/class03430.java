package minecraft;

public record class03430(int fluidLevel, class00500 fluidType) {

   public class03430(int fluidLevel, class00500 fluidType) {
      super();
      this.fluidLevel = fluidLevel;
      this.fluidType = fluidType;
   }

   public class00500 y() {
      return this.fluidType;
   }

   public int N() {
      return this.fluidLevel;
   }

   public class00500 N(int var1) {
      return var1 < this.fluidLevel ? this.fluidType : class00869.N.W();
   }
}

package minecraft;

public record class06053(class05163 box, class06040 terrainAdjustment, int groundLevelDelta) {
   public int L() {
      return this.groundLevelDelta;
   }

   public class06053(class05163 box, class06040 terrainAdjustment, int groundLevelDelta) {
      super();
      this.box = box;
      this.terrainAdjustment = terrainAdjustment;
      this.groundLevelDelta = groundLevelDelta;
   }

   public class06040 y() {
      return this.terrainAdjustment;
   }

   public class05163 N() {
      return this.box;
   }
}

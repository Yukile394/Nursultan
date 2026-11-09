package minecraft;

public enum class08089 implements class05033 {
   field_12648("harp", class04909.nk, class08065.field_41606),
   field_12653("basedrum", class04909.nn, class08065.field_41606),
   field_12643("snare", class04909.nO, class08065.field_41606),
   field_12645("hat", class04909.nY, class08065.field_41606),
   field_12651("bass", class04909.nt, class08065.field_41606),
   field_12650("flute", class04909.nd, class08065.field_41606),
   field_12644("bell", class04909.nG, class08065.field_41606),
   field_12654("guitar", class04909.nw, class08065.field_41606),
   field_12647("chime", class04909.nl, class08065.field_41606),
   field_12655("xylophone", class04909.ng, class08065.field_41606),
   field_18284("iron_xylophone", class04909.nI, class08065.field_41606),
   field_18285("cow_bell", class04909.nJ, class08065.field_41606),
   field_18286("didgeridoo", class04909.no, class08065.field_41606),
   field_18287("bit", class04909.nq, class08065.field_41606),
   field_18288("banjo", class04909.nK, class08065.field_41606),
   field_18289("pling", class04909.nQ, class08065.field_41606),
   field_41324("zombie", class04909.nV, class08065.field_41607),
   field_41325("skeleton", class04909.ne, class08065.field_41607),
   field_41326("creeper", class04909.nH, class08065.field_41607),
   field_41327("dragon", class04909.nc, class08065.field_41607),
   field_41328("wither_skeleton", class04909.nX, class08065.field_41607),
   field_41329("piglin", class04909.na, class08065.field_41607),
   field_41604("custom_head", class04909.OK, class08065.field_41608);

   private final String field_12646;
   private final class03556<class04891> field_12649;
   private final class08065 field_41605;

   public boolean L() {
      return this.field_41605 == class08065.field_41608;
   }

   private class08089(String var3, class03556<class04891> var4, class08065 var5) {
      this.field_12646 = var3;
      this.field_12649 = var4;
      this.field_41605 = var5;
   }

   public boolean u() {
      return this.field_41605 != class08065.field_41606;
   }

   public boolean y() {
      return this.field_41605 == class08065.field_41606;
   }

   public class03556<class04891> N() {
      return this.field_12649;
   }

   @Override
   public String method_15434() {
      return this.field_12646;
   }
}

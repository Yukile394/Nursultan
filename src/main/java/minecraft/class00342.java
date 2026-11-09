package minecraft;

import com.mojang.serialization.Codec;

public enum class00342 implements class05033 {
   field_55557("RANDOM", 0, "random"),
   field_55558("DAYTIME", 1, "daytime"),
   field_55559("MOON_PHASE", 2, "moon_phase");

   public static final Codec<class00342> field_55560 = class05033.N(class00342::values);
   private final String field_55561;

   class00342(String var3) {
      this.field_55561 = var3;
   }

   abstract float N(class03448 var1, class06584 var2, class08961 var3, class06069 var4);

   @Override
   public String method_15434() {
      return this.field_55561;
   }
}

package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class03662 implements class05033 {
   field_4315(0, "none"),
   field_4323(1, "thirdperson_lefthand"),
   field_4320(2, "thirdperson_righthand"),
   field_4321(3, "firstperson_lefthand"),
   field_4322(4, "firstperson_righthand"),
   field_4316(5, "head"),
   field_4317(6, "gui"),
   field_4318(7, "ground"),
   field_4319(8, "fixed"),
   field_61988(9, "on_shelf");

   public static final Codec<class03662> field_42468 = class05033.N(class03662::values);
   public static final IntFunction<class03662> field_42469 = class02121.N(class03662::N, values(), class02126.field_41664);
   private final byte field_42470;
   private final String field_42471;

   public boolean L() {
      return this == field_4321 || this == field_4323;
   }

   private class03662(int var3, String var4) {
      this.field_42471 = var4;
      this.field_42470 = (byte)var3;
   }

   public boolean y() {
      return this == field_4321 || this == field_4322;
   }

   public byte N() {
      return this.field_42470;
   }

   @Override
   public String method_15434() {
      return this.field_42471;
   }
}

package minecraft;

import com.mojang.serialization.MapCodec;

public class class07134 extends class07103<class07134> implements class07126 {
   private final MapCodec<class07134> field_25127 = MapCodec.unit(this::method_29140);
   private final class02362<class04247, class07134> field_48460 = class02362.N(this);

   public class07134(boolean var1) {
      super(var1);
   }

   @Override
   public MapCodec<class07134> method_29138() {
      return this.field_25127;
   }

   public class07134 method_29140() {
      return this;
   }

   @Override
   public class02362<class04247, class07134> method_56179() {
      return this.field_48460;
   }
}

package minecraft;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import io.netty.buffer.ByteBuf;

class class02392 implements class02362<ByteBuf, PropertyMap> {
   class02392() {
      super();
   }

   public void encode(ByteBuf var1, PropertyMap var2) {
      class02389.N(var1, var2.size(), 16);

      for (Property property : var2.values()) {
         class01663.N(var1, property.name(), 64);
         class01663.N(var1, property.value(), 32767);
         class00667.N(var1, property.signature(), (var0, var1x) -> class01663.N(var0, var1x, 1024));
      }
   }

   public PropertyMap decode(ByteBuf var1) {
      int i = class02389.N(var1, 16);
      Builder builder = ImmutableMultimap.builder();

      for (int j = 0; j < i; j++) {
         String s = class01663.N(var1, 64);
         String s1 = class01663.N(var1, 32767);
         String s2 = class00667.N(var1, (class02895<? super ByteBuf, String>)(var0 -> class01663.N(var0, 1024)));
         Property property = new Property(s, s1, s2);
         builder.put(property.name(), property);
      }

      return new PropertyMap(builder.build());
   }
}

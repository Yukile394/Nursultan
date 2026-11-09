package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import java.util.Objects;

public enum class06680 {
   field_29136((var0, var1) -> {
      String s = class02389.w.decode(var1);
      PropertyMap propertymap = class02389.d.decode(var1);
      var0.y = new GameProfile(var0.N, s, propertymap);
   }, (var0, var1) -> {
      GameProfile gameprofile = Objects.requireNonNull(var1.y());
      class02389.w.encode(var0, gameprofile.name());
      class02389.d.encode(var0, gameprofile.properties());
   }),
   field_40699((var0, var1) -> var0.Z = var1.L(class02048::N), (var0, var1) -> var0.N(var1.Z(), class02048::N)),
   field_29137((var0, var1) -> var0.i = class07282.N(var1.E()), (var0, var1) -> var0.L(var1.i().N())),
   field_40700((var0, var1) -> var0.L = var1.readBoolean(), (var0, var1) -> var0.writeBoolean(var1.L())),
   field_29138((var0, var1) -> var0.u = var1.E(), (var0, var1) -> var0.L(var1.u())),
   field_29139((var0, var1) -> var0.R = class00667.N(var1, class03748.u), (var0, var1) -> class00667.N(var0, var1.R(), class03748.u)),
   field_52324((var0, var1) -> var0.B = var1.E(), (var0, var1) -> var0.L(var1.B())),
   field_54981((var0, var1) -> var0.M = var1.readBoolean(), (var0, var1) -> var0.writeBoolean(var1.M()));

   final class06673 field_40701;
   final class06678 field_40702;

   private class06680(class06673 var3, class06678 var4) {
      this.field_40701 = var3;
      this.field_40702 = var4;
   }
}

package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class class06568 extends class06581 {
   private static final Logger N = LogUtils.getLogger();

   public class06568(class06573 var1) {
      super(var1);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      List list = class06584.a_(class02484.Nm, List.of());
      byte b0 = 1;
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(var3);
      this.N(class06584, b0, var2, localrefimpl);
      var3 = (class07050)localrefimpl.dispose();
      if (list.isEmpty()) {
         return class07082.u;
      } else {
         if (!var1.method_8608()) {
            class06482 class06482 = var1.method_8503().yM();
            ArrayList arraylist = new ArrayList(list.size());

            for (class05946 class05946 : list) {
               Optional<class03729<?>> optional = class06482.y(class05946);
               if (!optional.isPresent()) {
                  N.error("Invalid recipe: {}", class05946);
                  return class07082.u;
               }

               arraylist.add(optional.get());
            }

            var2.method_7254(arraylist);
            var2.method_7259(class01235.L.y(this));
         }

         return class07082.N;
      }
   }

   private void N(class06584 var1, int var2, class07438 var3, class07050 var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
         if (!var3.method_56992()) {
            var3.method_6122(var4, class06584.E);
         }
      } else {
         var1.N(var2, var3);
      }
   }

   private void N(class06584 var1, int var2, class07438 var3, LocalRef var4) {
      this.N(var1, var2, var3, (class07050)var4.get());
   }
}

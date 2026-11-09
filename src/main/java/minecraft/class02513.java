package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02513(class03543<class07078<?>> entityTypes, boolean joinTeam) implements class02560 {
   public static final MapCodec<class02513> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03541.N(class04227.I).fieldOf("entity").forGetter(class02513::y), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(class02513::L)
         )
         .apply(var0, class02513::new)
   );

   public boolean L() {
      return this.joinTeam;
   }

   public class02513(class03543<class07078<?>> entityTypes, boolean joinTeam) {
      this.entityTypes = entityTypes;
      this.joinTeam = joinTeam;
   }

   public class03543<class07078<?>> y() {
      return this.entityTypes;
   }

   @Override
   public MapCodec<class02513> N() {
      return N;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      class07209 class07209 = class07209.method_49638(var5);
      if (class07299.method_25953(class07209)) {
         Optional optional = this.y().N(var1.method_8409());
         if (!optional.isEmpty()) {
            class07049 class07049 = ((class07078)((class03556)optional.get()).N()).N(var1, class07209, class06113.field_16461);
            if (class07049 != null) {
               if (class07049 instanceof class00672 class00672 && var3.L() instanceof class04770 class04770) {
                  class00672.N(class04770);
               }

               if (this.joinTeam && var4.method_5781() != null) {
                  var1.method_14170().N(class07049.method_5820(), var4.method_5781());
               }

               class07049.method_5808(var5.M, var5.B, var5.Z, class07049.method_36454(), class07049.method_36455());
            }
         }
      }
   }
}

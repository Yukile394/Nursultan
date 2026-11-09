package minecraft;

import com.google.common.collect.ImmutableList;
import java.net.URL;
import java.util.List;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

class class01851 extends class05733 {
   private final List<class01847> y;
   @Nullable
   private final class05096 L;

   class01851(class06202 var1, @Nullable class05096 var2, List<class01847> var3, boolean var4, @Nullable class00392 var5, class00392 var6) {
      super(
         var5x -> {
            var2.N(var3);
            class00232 class00232 = var2.yL();
            if (var5x) {
               if (var1.i != null) {
                  var1.i.N(class04575.field_3768);
               }

               class00232.M();
            } else {
               class00232.B();
               if (var5) {
                  var1.u.method_10747(class00392.L("multiplayer.requiredTexturePrompt.disconnect"));
               } else if (var1.i != null) {
                  var1.i.N(class04575.field_3764);
               }
            }

            for (class01847 class01847 : var4) {
               class00232.N(class01847.N(), class01847.y(), class01847.L());
            }

            if (var1.i != null) {
               class04563.y(var1.i);
            }
         },
         var5 ? class00392.L("multiplayer.requiredTexturePrompt.line1") : class00392.L("multiplayer.texturePrompt.line1"),
         class01866.N(
            var5
               ? class00392.L("multiplayer.requiredTexturePrompt.line2").N(class06541.field_1054, class06541.field_1067)
               : class00392.L("multiplayer.texturePrompt.line2"),
            var6
         ),
         var5 ? class05220.Z : class05220.R,
         var5 ? class05220.T : class05220.M
      );
      this.N = var1;
      this.y = var4;
      this.L = var3;
   }

   public class01851 N(class06202 var1, UUID var2, URL var3, String var4, boolean var5, @Nullable class00392 var6) {
      ImmutableList immutablelist = ImmutableList.builderWithExpectedSize(this.y.size() + 1).addAll(this.y).add(new class01847(var2, var3, var4)).build();
      return new class01851(this.N, var1, this.L, (boolean)immutablelist, var5, var6);
   }
}

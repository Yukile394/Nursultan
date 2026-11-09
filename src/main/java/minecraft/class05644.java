package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Supplier;

record class05644(class07793 sourcePath, class07793 targetPath, class05677 op) {
   public static final Codec<class05644> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07793.N.fieldOf("source").forGetter(class05644::N),
            class07793.N.fieldOf("target").forGetter(class05644::y),
            class05677.field_45821.fieldOf("op").forGetter(class05644::L)
         )
         .apply(var0, class05644::new)
   );

   public class05677 L() {
      return this.op;
   }

   class05644(class07793 sourcePath, class07793 targetPath, class05677 op) {
      this.sourcePath = sourcePath;
      this.targetPath = targetPath;
      this.op = op;
   }

   public class07793 y() {
      return this.targetPath;
   }

   public void N(Supplier<class07709> var1, class07709 var2) {
      try {
         List list = this.sourcePath.N(var2);
         if (!list.isEmpty()) {
            this.op.N((class07709)var1.get(), this.targetPath, list);
         }
      } catch (CommandSyntaxException commandsyntaxexception) {
      }
   }

   public class07793 N() {
      return this.sourcePath;
   }
}

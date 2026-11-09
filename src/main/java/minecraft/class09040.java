package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class09040(class09039 common, class03543<class09037> dialogs, Optional<class08734> exitAction, int columns, int buttonWidth) implements class09019 {
   public static final MapCodec<class09040> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class09039.N.forGetter(class09040::H_),
            class09037.i.fieldOf("dialogs").forGetter(class09040::i),
            class08734.N.optionalFieldOf("exit_action").forGetter(class09040::L),
            class06338.b.optionalFieldOf("columns", 2).forGetter(class09040::y),
            y.optionalFieldOf("button_width", 150).forGetter(class09040::R)
         )
         .apply(var0, class09040::new)
   );

   @Override
   public Optional<class08734> L() {
      return this.exitAction;
   }

   public class09040(class09039 common, class03543<class09037> dialogs, Optional<class08734> exitAction, int columns, int buttonWidth) {
      this.common = common;
      this.dialogs = dialogs;
      this.exitAction = exitAction;
      this.columns = columns;
      this.buttonWidth = buttonWidth;
   }

   public class03543<class09037> i() {
      return this.dialogs;
   }

   @Override
   public int y() {
      return this.columns;
   }

   @Override
   public MapCodec<class09040> N() {
      return N;
   }

   public int R() {
      return this.buttonWidth;
   }

   @Override
   public class09039 H_() {
      return this.common;
   }
}

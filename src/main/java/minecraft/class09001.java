package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class09001(class09039 common, Optional<class08734> exitAction, int columns, int buttonWidth) implements class09019 {
   public static final MapCodec<class09001> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class09039.N.forGetter(class09001::H_),
            class08734.N.optionalFieldOf("exit_action").forGetter(class09001::L),
            class06338.b.optionalFieldOf("columns", 2).forGetter(class09001::y),
            y.optionalFieldOf("button_width", 150).forGetter(class09001::i)
         )
         .apply(var0, class09001::new)
   );

   @Override
   public Optional<class08734> L() {
      return this.exitAction;
   }

   public class09001(class09039 common, Optional<class08734> exitAction, int columns, int buttonWidth) {
      super();
      this.common = common;
      this.exitAction = exitAction;
      this.columns = columns;
      this.buttonWidth = buttonWidth;
   }

   public int i() {
      return this.buttonWidth;
   }

   @Override
   public int y() {
      return this.columns;
   }

   @Override
   public MapCodec<class09001> N() {
      return N;
   }

   @Override
   public class09039 H_() {
      return this.common;
   }
}

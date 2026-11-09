package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class09007(class09039 common, List<class08734> actions, Optional<class08734> exitAction, int columns) implements class09019 {
   public static final MapCodec<class09007> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class09039.N.forGetter(class09007::H_),
            class06338.y(class08734.N.listOf()).fieldOf("actions").forGetter(class09007::i),
            class08734.N.optionalFieldOf("exit_action").forGetter(class09007::L),
            class06338.b.optionalFieldOf("columns", 2).forGetter(class09007::y)
         )
         .apply(var0, class09007::new)
   );

   @Override
   public Optional<class08734> L() {
      return this.exitAction;
   }

   public class09007(class09039 common, List<class08734> actions, Optional<class08734> exitAction, int columns) {
      super();
      this.common = common;
      this.actions = actions;
      this.exitAction = exitAction;
      this.columns = columns;
   }

   public List<class08734> i() {
      return this.actions;
   }

   @Override
   public int y() {
      return this.columns;
   }

   @Override
   public MapCodec<class09007> N() {
      return N;
   }

   @Override
   public class09039 H_() {
      return this.common;
   }
}

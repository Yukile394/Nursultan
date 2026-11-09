package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class09024(class09039 common, class08734 action) implements class09032 {
   public static final class08734 N = new class08734(new class09027(class05220.B, 150), Optional.empty());
   public static final MapCodec<class09024> B = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class09039.N.forGetter(class09024::H_), class08734.N.optionalFieldOf("action", N).forGetter(class09024::i))
         .apply(var0, class09024::new)
   );

   public class09024(class09039 common, class08734 action) {
      super();
      this.common = common;
      this.action = action;
   }

   public class08734 i() {
      return this.action;
   }

   @Override
   public Optional<class08752> u() {
      return this.action.y();
   }

   @Override
   public List<class08734> y() {
      return List.of(this.action);
   }

   @Override
   public MapCodec<class09024> N() {
      return B;
   }

   @Override
   public class09039 H_() {
      return this.common;
   }
}

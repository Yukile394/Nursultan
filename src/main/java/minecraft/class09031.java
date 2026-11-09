package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class09031(class09039 common, class08734 yesButton, class08734 noButton) implements class09032 {
   public static final MapCodec<class09031> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class09039.N.forGetter(class09031::H_), class08734.N.fieldOf("yes").forGetter(class09031::i), class08734.N.fieldOf("no").forGetter(class09031::R)
         )
         .apply(var0, class09031::new)
   );

   public class09031(class09039 common, class08734 yesButton, class08734 noButton) {
      super();
      this.common = common;
      this.yesButton = yesButton;
      this.noButton = noButton;
   }

   public class08734 i() {
      return this.yesButton;
   }

   @Override
   public Optional<class08752> u() {
      return this.noButton.y();
   }

   @Override
   public List<class08734> y() {
      return List.of(this.yesButton, this.noButton);
   }

   @Override
   public MapCodec<class09031> N() {
      return N;
   }

   public class08734 R() {
      return this.noButton;
   }

   @Override
   public class09039 H_() {
      return this.common;
   }
}

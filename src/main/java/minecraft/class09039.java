package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class09039(
   class00392 title,
   Optional<class00392> externalTitle,
   boolean canCloseWithEscape,
   boolean pause,
   class08782 afterAction,
   List<class09034> body,
   List<class09009> inputs
) {
   public static final MapCodec<class09039> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class03748.N.fieldOf("title").forGetter(class09039::y),
               class03748.N.optionalFieldOf("external_title").forGetter(class09039::L),
               Codec.BOOL.optionalFieldOf("can_close_with_escape", true).forGetter(class09039::u),
               Codec.BOOL.optionalFieldOf("pause", true).forGetter(class09039::i),
               class08782.field_60966.optionalFieldOf("after_action", class08782.field_60962).forGetter(class09039::R),
               class09034.y.optionalFieldOf("body", List.of()).forGetter(class09039::M),
               class09009.N.listOf().optionalFieldOf("inputs", List.of()).forGetter(class09039::B)
            )
            .apply(var0, class09039::new)
      )
      .validate(
         var0 -> var0.pause && !var0.afterAction.N()
            ? DataResult.error(() -> "Dialogs that pause the game must use after_action values that unpause it after user action!")
            : DataResult.success(var0)
      );

   public Optional<class00392> L() {
      return this.externalTitle;
   }

   public List<class09034> M() {
      return this.body;
   }

   public class09039(
      class00392 title,
      Optional<class00392> externalTitle,
      boolean canCloseWithEscape,
      boolean pause,
      class08782 afterAction,
      List<class09034> body,
      List<class09009> inputs
   ) {
      this.title = title;
      this.externalTitle = externalTitle;
      this.canCloseWithEscape = canCloseWithEscape;
      this.pause = pause;
      this.afterAction = afterAction;
      this.body = body;
      this.inputs = inputs;
   }

   public List<class09009> B() {
      return this.inputs;
   }

   public boolean i() {
      return this.pause;
   }

   public boolean u() {
      return this.canCloseWithEscape;
   }

   public class00392 y() {
      return this.title;
   }

   public class00392 N() {
      return this.externalTitle.orElse(this.title);
   }

   public class08782 R() {
      return this.afterAction;
   }
}

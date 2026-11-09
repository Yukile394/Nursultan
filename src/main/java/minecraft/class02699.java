package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record class02699(List<class02826<String>> pages) implements class02499<String, class02699> {
   public static final class02699 N = new class02699(List.of());
   public static final int y = 1024;
   public static final int L = 100;
   private static final Codec<class02826<String>> B = class02826.N(Codec.string(0, 1024));
   public static final Codec<List<class02826<String>>> u = B.sizeLimitedListOf(100);
   public static final Codec<class02699> i = RecordCodecBuilder.create(
      var0 -> var0.group(u.optionalFieldOf("pages", List.of()).forGetter(class02699::N)).apply(var0, class02699::new)
   );
   public static final class02362<ByteBuf, class02699> R = class02826.N(class02389.y(1024)).N_33(class02389.L(100)).N_10(class02699::new, class02699::N);

   public class02699(List<class02826<String>> pages) {
      super();
      if (pages.size() > 100) {
         throw new IllegalArgumentException("Got " + pages.size() + " pages, but maximum is 100");
      } else {
         this.pages = (List<class02826<String>>)pages;
      }
   }

   public class02699 y(List<class02826<String>> var1) {
      return new class02699(var1);
   }

   @Override
   public List<class02826<String>> N() {
      return this.pages;
   }

   public Stream<String> N(boolean var1) {
      return this.pages.stream().map(var1x -> var1x.N(var1));
   }
}

package minecraft;

import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface class02170 extends class02350<StringReader> {
   Stream<class01894> y();

   @Override
   default Stream<String> possibleValues(class02325<StringReader> var1) {
      return this.y().map(class01894::toString);
   }
}

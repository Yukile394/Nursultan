package minecraft;

import io.netty.buffer.ByteBuf;
import org.jspecify.annotations.Nullable;

record class02887<L extends class00638>(class00648 id, class00423 flow, class02362<ByteBuf, class00381<? super L>> codec, class03276 bundlerInfo)
   implements class04275<L> {
   @Override
   public class02362<ByteBuf, class00381<? super L>> L() {
      return this.codec;
   }

   class02887(class00648 id, class00423 flow, class02362<ByteBuf, class00381<? super L>> codec, @Nullable class03276 bundlerInfo) {
      this.id = id;
      this.flow = flow;
      this.codec = codec;
      this.bundlerInfo = bundlerInfo;
   }

   @Nullable
   @Override
   public class03276 u() {
      return this.bundlerInfo;
   }

   @Override
   public class00423 y() {
      return this.flow;
   }

   @Override
   public class00648 N() {
      return this.id;
   }
}

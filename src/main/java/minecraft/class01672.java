package minecraft;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

record class01672(LongSet chunksWhichReceivedNeighbors, BlockingQueue<class03345> sectionsToPropagateFrom) {

   class01672() {
      this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
   }

   private class01672(LongSet chunksWhichReceivedNeighbors, BlockingQueue<class03345> sectionsToPropagateFrom) {
      super();
      this.chunksWhichReceivedNeighbors = chunksWhichReceivedNeighbors;
      this.sectionsToPropagateFrom = sectionsToPropagateFrom;
   }

   public BlockingQueue<class03345> y() {
      return this.sectionsToPropagateFrom;
   }

   public LongSet N() {
      return this.chunksWhichReceivedNeighbors;
   }
}

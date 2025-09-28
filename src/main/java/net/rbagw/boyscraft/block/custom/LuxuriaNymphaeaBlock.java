package net.rbagw.boyscraft.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class LuxuriaNymphaeaBlock extends PlantBlock {
    public static final MapCodec<LuxuriaNymphaeaBlock> CODEC = createCodec(LuxuriaNymphaeaBlock::new);
    private static final VoxelShape SHAPE = Block.createCuboidShape(8, 2.5,8,8,2.5,8);

    public LuxuriaNymphaeaBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {

    }
}

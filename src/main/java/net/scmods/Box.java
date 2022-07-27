package net.scmods;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class Box extends MostlyEmptyBlock {
    protected final VoxelShape outlineShape = VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(
        VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(
        VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(
        VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(VoxelShapes.union(
        VoxelShapes.union(VoxelShapes.union(VoxelShapes.cuboid(0.4375, 0, 0.0625, 0.5625, 1, 0.125), 
        VoxelShapes.cuboid(0.875, 0, 0.4375, 0.9375, 1, 0.5625)), 
        VoxelShapes.cuboid(0.4375, 0, 0.875, 0.5625, 1, 0.9375)), 
        VoxelShapes.cuboid(0.0625, 0, 0.4375, 0.125, 1, 0.5625)),
        VoxelShapes.cuboid(0.03125, 0.03125, 0.25, 0.21875, 0.21875, 0.75)), 
        VoxelShapes.cuboid(0.03125, 0.78125, 0.25, 0.21875, 0.96875, 0.75)), 
        VoxelShapes.cuboid(0.78125, 0.78125, 0.25, 0.96875, 0.96875, 0.75)), 
        VoxelShapes.cuboid(0.78125, 0.03125, 0.25, 0.96875, 0.21875, 0.75)), 
        VoxelShapes.cuboid(0.25, 0.03125, 0.03125, 0.75, 0.21875, 0.21875)), 
        VoxelShapes.cuboid(0.25, 0.03125, 0.78125, 0.75, 0.21875, 0.96875)), 
        VoxelShapes.cuboid(0.25, 0.78125, 0.78125, 0.75, 0.96875, 0.96875)), 
        VoxelShapes.cuboid(0.25, 0.78125, 0.03125, 0.75, 0.96875, 0.21875)), 
        VoxelShapes.cuboid(0.78125, 0.25, 0.03125, 0.96875, 0.75, 0.21875)), 
        VoxelShapes.cuboid(0.78125, 0.25, 0.78125, 0.96875, 0.75, 0.96875)), 
        VoxelShapes.cuboid(0.03125, 0.25, 0.78125, 0.21875, 0.75, 0.96875)), 
        VoxelShapes.cuboid(0.03125, 0.25, 0.03125, 0.21875, 0.75, 0.21875)), 
        VoxelShapes.cuboid(0.09375, 0.09375, 0.09375, 0.90625, 0.90625, 0.90625)), 
        VoxelShapes.cuboid(0.75, 0.75, 0, 1, 1, 0.25)), 
        VoxelShapes.cuboid(0, 0.75, 0, 0.25, 1, 0.25)), 
        VoxelShapes.cuboid(0, 0.75, 0.75, 0.25, 1, 1)), 
        VoxelShapes.cuboid(0.75, 0.75, 0.75, 1, 1, 1)), 
        VoxelShapes.cuboid(0.75, 0, 0, 1, 0.25, 0.25)), 
        VoxelShapes.cuboid(0.75, 0, 0.75, 1, 0.25, 1)), 
        VoxelShapes.cuboid(0, 0, 0.75, 0.25, 0.25, 1)), 
        VoxelShapes.cuboid(0, 0, 0, 0.25, 0.25, 0.25));
    protected final VoxelShape collisionShape = VoxelShapes.fullCube();

    public Box(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return outlineShape;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return collisionShape;
    }
}
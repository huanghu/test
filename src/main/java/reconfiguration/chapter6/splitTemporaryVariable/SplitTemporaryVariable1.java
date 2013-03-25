package reconfiguration.chapter6.splitTemporaryVariable;

/**
 * 计算苏格兰布丁运动距离。根据牛顿第二定律，可以这样计算布丁运动
 * @author huanghu
 *
 */
public class SplitTemporaryVariable1 {
	
	double _primaryForce;
	double _mass;
	double _secondaryForce;
	int _delay = 1;
	
	public SplitTemporaryVariable1(double _primaryForce ,double _mass ,double _secondaryForce){
		this._primaryForce = _primaryForce;
		this._mass = _mass;
		this._secondaryForce = _secondaryForce;
	}
	
	public double getDistanceTravelled(int time){
		double result;
		double acc = _primaryForce / _mass;
		int primaryTime = Math.min(time ,_delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		int secondaryTime = time * _delay;
		if(secondaryTime > 0){
			double primaryVel = acc * _delay;
			//acc 被赋值两次
			acc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime - 0.5 * acc * secondaryTime * secondaryTime;
		}
		return result;
	}
	
	/**
	 * 第一步 先把acc临时变量变为final，接下来把第二次赋值之前对acc变量的所有引用点
	 * 全部改用新的临时变量
	 */
	public double getDistanceTravelled1(int time){
		double result;
//		double acc = _primaryForce / _mass;
		final double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time ,_delay);
//		result = 0.5 * acc * primaryTime * primaryTime;
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secondaryTime = time * _delay;
		if(secondaryTime > 0){
//			double primaryVel = acc * _delay;
			double primaryVel = primaryAcc * _delay;
//			acc = (_primaryForce + _secondaryForce) / _mass;
			double acc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime - 0.5 * acc * secondaryTime * secondaryTime;
		}
		return result;
	}
	
	/**
	 * 第二步 继续处理acc临时变量的第二次赋值
	 * double acc = (_primaryForce + _secondaryForce) / _mass; --> final double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
	 */
	public double getDistanceTravelled2(int time){
		double result;
		final double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time ,_delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secondaryTime = time * _delay;
		if(secondaryTime > 0){
			double primaryVel = primaryAcc * _delay;
			final double secondaryAcc = (_primaryForce + _secondaryForce) / _mass; //
			result += primaryVel * secondaryTime - 0.5 * secondaryAcc * secondaryTime * secondaryTime; //
		}
		return result;
	}
	
}

package reconfiguration.chapter6.splitTemporaryVariable;

/**
 * �����ո��������˶����롣����ţ�ٵڶ����ɣ������������㲼���˶�
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
			//acc ����ֵ����
			acc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime - 0.5 * acc * secondaryTime * secondaryTime;
		}
		return result;
	}
	
	/**
	 * ��һ�� �Ȱ�acc��ʱ������Ϊfinal���������ѵڶ��θ�ֵ֮ǰ��acc�������������õ�
	 * ȫ�������µ���ʱ����
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
	 * �ڶ��� ��������acc��ʱ�����ĵڶ��θ�ֵ
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

package AbstractionInterfaceAssin;

 interface MusicalInstrument {
	
	void play();

}
class  PercussionInstrument implements  MusicalInstrument
{
	public void play()
	{
		System.out.println(" MusicalInstrument is a plyeing method");
	}
	}
class StringedInstrument implements MusicalInstrument
{
	
	public void play()
	{
		System.out.println(" StringedInstrument is a plyeing method");
	}
}
class PercussionInstrument extends Sound implements MusicalInstrument
{
	public void listenSound()
	{
	System.out.println("listening the PercussionInstrument sound ");
	}
	public void learnInstrument()
	{
		System.out.println("learnInstrument the PercussionInstrument sound  ");
	}
	public void play()
	{
		System.out.println(" PercussionInstrument is a plyeing method");
	}
	
	}
 class  StringedInstrument extends Sound implements  MusicalInstrument
{
	public void listenSound()
	{
	System.out.println("listening the StringedInstrument  sound ");
	}
	public void learnInstrument()
	{
		System.out.println("learnInstrument the  StringedInstrument  sound  ");
	}
	public void play()
	{
		System.out.println("  StringedInstrument  is a plyeing method");
	}
	
	}
abstract class Sound
{
	
	abstract void listenSound();

	public void learnInstrument()
	{
		System.out.println("learnInstrument sound  ");
	}
}
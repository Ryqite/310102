fun main()
{
    val brain=Brain(44.2,78)
    val nose=Nose(13.5,"большой")
    val mouth=Mouth(21.3,"средний")
    val stomach=Stomach(58.4,59.6,mouth)
    val ear=Ear(35.7,true)
    brain.Manage_Nose(nose)
    ear.Hear("звуки природы")
    nose.Itch("зуд/зуда")
    mouth.Speak("Идет разговор")
    brain.Manage_Mouth(mouth)
    stomach.getFood(mouth::Eat,"икра")
    brain.getItch(nose::Itch,"зуд")
    brain.getSmell()
    brain.getSound(ear::Hear,"звуки природы")
}
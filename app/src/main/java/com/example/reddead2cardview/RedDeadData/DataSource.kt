package com.example.reddead2cardview.RedDeadData

import com.example.reddead2cardview.RedDeadModel.RedDeadAtributos

class DataSource {


  companion object {

      fun createDataSet():ArrayList<RedDeadAtributos> {


          val list = ArrayList<RedDeadAtributos>()


          list.add(

              RedDeadAtributos("Arthur Morgan",
                  "https://1.bp.blogspot.com/-7omOttZbiLQ/XTSrML3lHMI/AAAAAAAALqQ/8uGoUNIHNEc__9F63abp2ZnPvl77zyghgCEwYBhgL/s640/red_dead_redemption_2_screenshot-r_13-600x338.jpg",
                  "“Nós somos ladrões, em um mundo que não nos quer mais”"
                 )

          )
          list.add(

              RedDeadAtributos(
                 "Sadia Adler",
                  "https://i.ytimg.com/vi/8UC7rqWyWf4/maxresdefault.jpg",
                  "“Ninguém vai pegar coisa alguma de mim novamente”"

              )
          )
          list.add(

              RedDeadAtributos(

                  "Charles Smith",
                  "https://i.pinimg.com/originals/8c/74/21/8c7421fdd0ca685e17eac24bcdd2d521.jpg",
                  "“A quantidade de inferno que criamos, nós devemos alguns de volta”"

              )
          )


          list.add(

              RedDeadAtributos(

                  "John Marston",
                  "https://pm1.narvii.com/7108/f26d554bf5a5d11512eecdc1a86b7b015a1dd41er1-575-644v2_00.jpg",
                  "“Acho que tudo que sobrou pra mim são dúvidas. Dúvidas e cicatrizes”"
              )

          )



          list.add(
              RedDeadAtributos(
                   "Dutch van der Linde",
                  "https://oyster.ignimgs.com/wordpress/stg.ign.com/2018/05/Dutch-van-der-Linde.jpg",
                  " “Eles estão nos perseguindo duramente. Porque nos representamos tudo que eles temem”"

              )
          )
          list.add(

              RedDeadAtributos(

                  "Jack Marston",
                  "https://vignette.wikia.nocookie.net/reddead/images/d/db/JACK1907.png/revision/latest?cb=20181220171130&path-prefix=pt-br",
                  "“Você pegou os caras maus?”"
              )
          )

          list.add(

              RedDeadAtributos(

                  "Hosea Matthews",
                  "https://pbs.twimg.com/profile_images/1065838991679713280/b6puvQMN_400x400.jpg",
                  "“Eu gostaria de ter adquirido sabedoria por um custo menor”"
              )

          )

          list.add(

             RedDeadAtributos(
                 "Abigail Roberts",
              "https://pm1.narvii.com/7180/16f3cb1b26a0168303dff266401f424ee3dada2cr1-800-489v2_uhq.jpg",
                 "“Se eles causarem um único arranhão nele, eu juro que levarei o fogo do inferno para eles eu mesma”"

             )

          )

          list.add(

              RedDeadAtributos(

                 "Micah Bell" ,
                  "https://images7.alphacoders.com/952/thumb-1920-952684.jpg",
                  "“Eu acredito que há vencedores e perdedores… e nada entre eles”"
              )
          )


          return list

      }
  }


}
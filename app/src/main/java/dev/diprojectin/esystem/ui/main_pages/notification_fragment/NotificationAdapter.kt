package dev.diprojectin.esystem.ui.main_pages.notification_fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.diprojectin.esystem.R

class NotificationAdapter(private val notificationList: List<NotificationModel>) :
    RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {

    class NotificationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title_notification)
        val file: TextView = itemView.findViewById(R.id.file_notification)
        val date: TextView = itemView.findViewById(R.id.date_notification)
        val time: TextView = itemView.findViewById(R.id.time_notification)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_notification, parent, false)
        return NotificationViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        val notification = notificationList[position]
        holder.title.text = notification.title
        holder.file.text = notification.file
        holder.date.text = notification.date
        holder.time.text = notification.time
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }
}